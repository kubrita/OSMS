// @SOURCE:C:/Users/kubra/Desktop/OSMS/conf/routes
// @HASH:92c3429156962f1da7b69dfc28219434dd55bcd4
// @DATE:Tue Jun 07 18:29:28 EEST 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:34
// @LINE:31
// @LINE:23
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:34
class ReverseAssets {
    

// @LINE:34
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:8
// @LINE:7
// @LINE:6
class ReverseAuthentication {
    

// @LINE:7
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:8
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:6
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          

// @LINE:23
// @LINE:13
// @LINE:9
class ReverseCourseCtrl {
    

// @LINE:9
def getCourseList(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/v1/courses.json")
}
                                                

// @LINE:23
def addCourse(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "api/v1/courses/addcourse.json")
}
                                                

// @LINE:13
def getCourseById(id:Int): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/v1/course/" + implicitly[PathBindable[Int]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:31
class ReverseApplication {
    

// @LINE:31
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:17
// @LINE:16
class ReverseStudentCtrl {
    

// @LINE:16
def getStudentById(id:Int): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/v1/student/" + implicitly[PathBindable[Int]].unbind("id", id))
}
                                                

// @LINE:17
def getStudentList(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/v1/students.json")
}
                                                
    
}
                          
}
                  


// @LINE:34
// @LINE:31
// @LINE:23
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:34
class ReverseAssets {
    

// @LINE:34
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:8
// @LINE:7
// @LINE:6
class ReverseAuthentication {
    

// @LINE:7
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Authentication.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:8
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Authentication.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:6
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Authentication.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              

// @LINE:23
// @LINE:13
// @LINE:9
class ReverseCourseCtrl {
    

// @LINE:9
def getCourseList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CourseCtrl.getCourseList",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/courses.json"})
      }
   """
)
                        

// @LINE:23
def addCourse : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CourseCtrl.addCourse",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/courses/addcourse.json"})
      }
   """
)
                        

// @LINE:13
def getCourseById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CourseCtrl.getCourseById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/course/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:31
class ReverseApplication {
    

// @LINE:31
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:17
// @LINE:16
class ReverseStudentCtrl {
    

// @LINE:16
def getStudentById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentCtrl.getStudentById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/student/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:17
def getStudentList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentCtrl.getStudentList",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/students.json"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:34
// @LINE:31
// @LINE:23
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {

// @LINE:34
class ReverseAssets {
    

// @LINE:34
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:8
// @LINE:7
// @LINE:6
class ReverseAuthentication {
    

// @LINE:7
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Authentication.authenticate(), HandlerDef(this, "controllers.Authentication", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:8
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Authentication.logout(), HandlerDef(this, "controllers.Authentication", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:6
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Authentication.login(), HandlerDef(this, "controllers.Authentication", "login", Seq(), "GET", """ Authentication""", _prefix + """login""")
)
                      
    
}
                          

// @LINE:23
// @LINE:13
// @LINE:9
class ReverseCourseCtrl {
    

// @LINE:9
def getCourseList(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CourseCtrl.getCourseList(), HandlerDef(this, "controllers.CourseCtrl", "getCourseList", Seq(), "GET", """""", _prefix + """api/v1/courses.json""")
)
                      

// @LINE:23
def addCourse(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CourseCtrl.addCourse(), HandlerDef(this, "controllers.CourseCtrl", "addCourse", Seq(), "POST", """ POST Requests
Course""", _prefix + """api/v1/courses/addcourse.json""")
)
                      

// @LINE:13
def getCourseById(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CourseCtrl.getCourseById(id), HandlerDef(this, "controllers.CourseCtrl", "getCourseById", Seq(classOf[Int]), "GET", """Course""", _prefix + """api/v1/course/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:31
class ReverseApplication {
    

// @LINE:31
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """""", _prefix + """""")
)
                      
    
}
                          

// @LINE:17
// @LINE:16
class ReverseStudentCtrl {
    

// @LINE:16
def getStudentById(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentCtrl.getStudentById(id), HandlerDef(this, "controllers.StudentCtrl", "getStudentById", Seq(classOf[Int]), "GET", """Student""", _prefix + """api/v1/student/$id<[^/]+>""")
)
                      

// @LINE:17
def getStudentList(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentCtrl.getStudentList(), HandlerDef(this, "controllers.StudentCtrl", "getStudentList", Seq(), "GET", """""", _prefix + """api/v1/students.json""")
)
                      
    
}
                          
}
                  
      