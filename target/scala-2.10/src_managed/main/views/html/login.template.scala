
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object login extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Authentication.Login],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(form: Form[Authentication.Login]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.36*/("""
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>OSMS Login</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.48*/routes/*9.54*/.Assets.at("styles/main.css"))),format.raw/*9.83*/("""">
  <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.53*/routes/*10.59*/.Assets.at("images/favicon.png"))),format.raw/*10.91*/("""">
  <script src=""""),_display_(Seq[Any](/*11.17*/routes/*11.23*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*11.68*/("""" type="text/javascript"></script>
  <!--[if lt IE 9]>
  <script src=""""),_display_(Seq[Any](/*13.17*/routes/*13.23*/.Assets.at("javascripts/html5shiv.js"))),format.raw/*13.61*/(""""></script>
  <script src=""""),_display_(Seq[Any](/*14.17*/routes/*14.23*/.Assets.at("javascripts/respond.js"))),format.raw/*14.59*/(""""></script>
  <![endif]-->
  <meta http-equiv="X-UA-Compatible" content="IE=edge"> 
</head>
<body>


    <div align="right">
	
	<p>Environment: """),_display_(Seq[Any](/*23.19*/play/*23.23*/.Play.application().configuration().getString("project.environment"))),format.raw/*23.91*/("""</p>
	<p>Version : """),_display_(Seq[Any](/*24.16*/play/*24.20*/.Play.application().configuration().getString("project.version"))),format.raw/*24.84*/("""</p>
	</div>

  <div class="container">
    """),_display_(Seq[Any](/*28.6*/helper/*28.12*/.form(routes.Authentication.authenticate)/*28.53*/ {_display_(Seq[Any](format.raw/*28.55*/("""
      """),_display_(Seq[Any](/*29.8*/if(form.hasGlobalErrors)/*29.32*/ {_display_(Seq[Any](format.raw/*29.34*/("""
        <div class="alert alert-warning alert-dismissable">
          <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
          """),_display_(Seq[Any](/*32.12*/form/*32.16*/.globalError.message)),format.raw/*32.36*/("""
        </div>
      """)))})),format.raw/*34.8*/("""
      """),_display_(Seq[Any](/*35.8*/if(flash.contains("success"))/*35.37*/ {_display_(Seq[Any](format.raw/*35.39*/("""
        <div class="alert alert-success alert-dismissable">
          <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
          """),_display_(Seq[Any](/*38.12*/flash/*38.17*/.get("success"))),format.raw/*38.32*/("""
        </div>
      """)))})),format.raw/*40.8*/("""
      <form class="form-signin" role="form">
      <div class="row">
        <div class="col-sm-6 col-md-4 col-md-offset-4">
        <h2 class="form-signin-heading">OSMS Login</h2>
        <input name="usercode" type="text" class="form-control" placeholder="Username" value=""""),_display_(Seq[Any](/*45.96*/form("usercode")/*45.112*/.value)),format.raw/*45.118*/("""" required>
        <input type="password" class="form-control" placeholder="Password" required name="password">
        
        <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>

        </div>
      </div>
      </form>
    """)))})),format.raw/*53.6*/("""
  </div>
</body>
</html>"""))}
    }
    
    def render(form:Form[Authentication.Login]): play.api.templates.Html = apply(form)
    
    def f:((Form[Authentication.Login]) => play.api.templates.Html) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jun 07 18:29:29 EEST 2016
                    SOURCE: C:/Users/kubra/Desktop/OSMS/app/views/login.scala.html
                    HASH: 97d6283644319bcc910cdf6c15d7c1a85bb3a94d
                    MATRIX: 743->1|854->35|1157->303|1171->309|1221->338|1313->394|1328->400|1382->432|1438->452|1453->458|1520->503|1629->576|1644->582|1704->620|1769->649|1784->655|1842->691|2032->845|2045->849|2135->917|2192->938|2205->942|2291->1006|2375->1055|2390->1061|2440->1102|2480->1104|2524->1113|2557->1137|2597->1139|2811->1317|2824->1321|2866->1341|2922->1366|2966->1375|3004->1404|3044->1406|3258->1584|3272->1589|3309->1604|3365->1629|3683->1911|3709->1927|3738->1933|4033->2197
                    LINES: 26->1|29->1|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|41->13|41->13|41->13|42->14|42->14|42->14|51->23|51->23|51->23|52->24|52->24|52->24|56->28|56->28|56->28|56->28|57->29|57->29|57->29|60->32|60->32|60->32|62->34|63->35|63->35|63->35|66->38|66->38|66->38|68->40|73->45|73->45|73->45|81->53
                    -- GENERATED --
                */
            