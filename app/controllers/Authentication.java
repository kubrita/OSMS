package controllers;

import java.util.Locale;

import model.UserInfo;
import play.data.Form;
import play.data.validation.Constraints.Required;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

public class Authentication extends Controller {

	public static class Login {

		@Required
		public String usercode;
		public String password;

		public String validate() {
			//			Query q = JPA.em().createNativeQuery("select USER_PASSWORD from users where user_code = ?1").setParameter(1, usercode.toUpperCase());

			UserInfo userInfo = JPA.em().find(UserInfo.class, usercode);

			if(userInfo == null){
				return "Incorrect username";
			}

			if(!decrypt_pass(userInfo.getPassword() + "").equals(password.toUpperCase(Locale.ENGLISH))){
				return "Incorrect password";
			}

			return null;
		}

	}

	public static Result login() {
		return ok(views.html.login.render(Form.form(Login.class)));
	}

	@Transactional (readOnly = true)
	public static Result logout() {
		session().clear();
		return redirect("login");
	}

	@Transactional (readOnly = true)
	public static Result authenticate() {
		Form<Login> loginForm = Form.form(Login.class).bindFromRequest();
		if(loginForm.hasErrors()){
			return badRequest(views.html.login.render(loginForm));
		}
		else{
			session("loggedfrom", "BROWSER");
			session("usercode", loginForm.get().usercode);
			return redirect(routes.Application.index());
		}
	}

	private static String decrypt_pass(String encr_pass) {
		final int PASS_CHAR_SET_SIZE = 37;
		String encr_set = "I6M8U1FWOL3QD0_EGX5JVAZBS4K7CP2Y9TNHR";
		String normal_set = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";
		int i, j, k, l;
		String decr_pass = "";
		String work_pass;
		String new_pass = encr_pass;
		int nr_times = 0;
		for(i = 1; i < 37; i++)
			if(encr_set.charAt(i) == new_pass.charAt(0)) nr_times = i;

		work_pass = new_pass.substring(1).toUpperCase();
		int pass_len = work_pass.length();
		for(i = 0; i < pass_len; i++)
			decr_pass = decr_pass + " ";
		StringBuilder decr = new StringBuilder(decr_pass);
		for(k = 0; k < nr_times; k++){
			for(j = 0; j < PASS_CHAR_SET_SIZE; j++){
				for(i = 0; i < pass_len; i++){
					l = mymod(j - i + PASS_CHAR_SET_SIZE, PASS_CHAR_SET_SIZE);
					if(encr_set.charAt(j) == work_pass.charAt(i)) decr.setCharAt(i, normal_set.charAt(l));
				}
			}
			work_pass = decr.toString();
		}
		return (work_pass);
	}

	private static int mymod(int source, int divisor) {
		int result = (source / divisor);
		int modula = source - result * divisor;
		return (modula);
	}

}
