// @SOURCE:C:/Users/kubra/Desktop/OSMS/conf/routes
// @HASH:92c3429156962f1da7b69dfc28219434dd55bcd4
// @DATE:Tue Jun 07 18:29:28 EEST 2016


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix  
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" } 


// @LINE:6
private[this] lazy val controllers_Authentication_login0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:7
private[this] lazy val controllers_Authentication_authenticate1 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:8
private[this] lazy val controllers_Authentication_logout2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:9
private[this] lazy val controllers_CourseCtrl_getCourseList3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/v1/courses.json"))))
        

// @LINE:13
private[this] lazy val controllers_CourseCtrl_getCourseById4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/v1/course/"),DynamicPart("id", """[^/]+"""))))
        

// @LINE:16
private[this] lazy val controllers_StudentCtrl_getStudentById5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/v1/student/"),DynamicPart("id", """[^/]+"""))))
        

// @LINE:17
private[this] lazy val controllers_StudentCtrl_getStudentList6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/v1/students.json"))))
        

// @LINE:23
private[this] lazy val controllers_CourseCtrl_addCourse7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/v1/courses/addcourse.json"))))
        

// @LINE:31
private[this] lazy val controllers_Application_index8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:34
private[this] lazy val controllers_Assets_at9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+"""))))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Authentication.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Authentication.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Authentication.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/v1/courses.json""","""controllers.CourseCtrl.getCourseList()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/v1/course/$id<[^/]+>""","""controllers.CourseCtrl.getCourseById(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/v1/student/$id<[^/]+>""","""controllers.StudentCtrl.getStudentById(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/v1/students.json""","""controllers.StudentCtrl.getStudentList()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/v1/courses/addcourse.json""","""controllers.CourseCtrl.addCourse()"""),("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
       
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Authentication_login0(params) => {
   call { 
        invokeHandler(controllers.Authentication.login(), HandlerDef(this, "controllers.Authentication", "login", Nil,"GET", """ Authentication""", Routes.prefix + """login"""))
   }
}
        

// @LINE:7
case controllers_Authentication_authenticate1(params) => {
   call { 
        invokeHandler(controllers.Authentication.authenticate(), HandlerDef(this, "controllers.Authentication", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:8
case controllers_Authentication_logout2(params) => {
   call { 
        invokeHandler(controllers.Authentication.logout(), HandlerDef(this, "controllers.Authentication", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:9
case controllers_CourseCtrl_getCourseList3(params) => {
   call { 
        invokeHandler(controllers.CourseCtrl.getCourseList(), HandlerDef(this, "controllers.CourseCtrl", "getCourseList", Nil,"GET", """""", Routes.prefix + """api/v1/courses.json"""))
   }
}
        

// @LINE:13
case controllers_CourseCtrl_getCourseById4(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        invokeHandler(controllers.CourseCtrl.getCourseById(id), HandlerDef(this, "controllers.CourseCtrl", "getCourseById", Seq(classOf[Int]),"GET", """Course""", Routes.prefix + """api/v1/course/$id<[^/]+>"""))
   }
}
        

// @LINE:16
case controllers_StudentCtrl_getStudentById5(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        invokeHandler(controllers.StudentCtrl.getStudentById(id), HandlerDef(this, "controllers.StudentCtrl", "getStudentById", Seq(classOf[Int]),"GET", """Student""", Routes.prefix + """api/v1/student/$id<[^/]+>"""))
   }
}
        

// @LINE:17
case controllers_StudentCtrl_getStudentList6(params) => {
   call { 
        invokeHandler(controllers.StudentCtrl.getStudentList(), HandlerDef(this, "controllers.StudentCtrl", "getStudentList", Nil,"GET", """""", Routes.prefix + """api/v1/students.json"""))
   }
}
        

// @LINE:23
case controllers_CourseCtrl_addCourse7(params) => {
   call { 
        invokeHandler(controllers.CourseCtrl.addCourse(), HandlerDef(this, "controllers.CourseCtrl", "addCourse", Nil,"POST", """ POST Requests
Course""", Routes.prefix + """api/v1/courses/addcourse.json"""))
   }
}
        

// @LINE:31
case controllers_Application_index8(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:34
case controllers_Assets_at9(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}
    
}
        