
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(node : String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""
<!doctype html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Online Student Management System</title>
    <base href="/" />
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,800" rel="stylesheet" type="text/css">
    <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
    <link rel="stylesheet" href=""""),_display_(Seq[Any](/*12.35*/routes/*12.41*/.Assets.at("styles/vendor.6fc842d1.css"))),format.raw/*12.81*/("""">

    <link rel="stylesheet" href=""""),_display_(Seq[Any](/*14.35*/routes/*14.41*/.Assets.at("styles/main.ada01a85.css"))),format.raw/*14.79*/("""">
    <style>
      div.modal """),format.raw/*16.17*/("""{"""),format.raw/*16.18*/("""
          z-index: 6050 !important;
      """),format.raw/*18.7*/("""}"""),format.raw/*18.8*/("""
    </style>
    <script>
      window.bootstrappedCurrentCustomer = """),_display_(Seq[Any](/*21.45*/Html(node))),format.raw/*21.55*/(""";
      
      """),_display_(Seq[Any](/*23.8*/if(session.get("loggedfrom") == "businesscenter" || session.get("loggedfrom") == "businesscenter_salesrep" || session.get("loggedfrom") == "getcoupons" || session.get("loggedfrom") == "EXTERNAL_CONNECTION")/*23.214*/ {_display_(Seq[Any](format.raw/*23.216*/("""
    	  window.apiUrl = """"),_display_(Seq[Any](/*24.26*/play/*24.30*/.Play.application().configuration().getString("uatbirds.url"))),format.raw/*24.91*/(""""  
      """)))})),format.raw/*25.8*/("""
      """),_display_(Seq[Any](/*26.8*/if(session.get("loggedfrom") == "LISTING_MANAGER" || session.get("loggedfrom") == "kitbox")/*26.99*/ {_display_(Seq[Any](format.raw/*26.101*/("""
    	  window.apiUrl = """"),_display_(Seq[Any](/*27.26*/play/*27.30*/.Play.application().configuration().getString("uatserver.url"))),format.raw/*27.92*/(""""
      """)))})),format.raw/*28.8*/("""
       
    </script>
  </head>
  <body ng-app="lmApp" class="drawer drawer-right">
    <header role="banner">
      <div class="drawer-header">
        <button type="button" class="drawer-toggle drawer-hamburger">
          <span class="sr-only">toggle navigation</span>
          <span class="drawer-hamburger-icon"></span>
        </button>
      </div>
      <div class="drawer-main drawer-default">
        <nav style="" class=" drawer-nav" role="navigation">
          <div class="drawer-brand">
            <a class="navbar-brand" href="/">
              <img src=""""),_display_(Seq[Any](/*44.26*/routes/*44.32*/.Assets.at("images/logo-small-rev.png"))),format.raw/*44.71*/("""" alt="logo" class="gp-logo">
            </a>
          </div>
          <ul class="drawer-menu">
            <li class="drawer-menu-item">
              <br />
              <ul class="drawer-submenu">
              <br>
                <li class="drawer-submenu-item"><a href="/logout" onclick="window.location.href = '/logout'">Sign Out</a></li>
              </ul>
            </li>
          </ul>
        </nav>
      </div>
    </header>
    <div class="drawer-overlay">
    <div class="navbar navbar-default navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <a class="navbar-brand" href="/"><img src=""""),_display_(Seq[Any](/*63.55*/routes/*63.61*/.Assets.at("images/logo-small.png"))),format.raw/*63.96*/("""" alt="Logo" class="gp-logo">
          </a>
        </div>
        <div class="navbar">
          <ul class="nav navbar-nav">
            <li class="col-md-4 col-xs-6"><a href="/">Students</a></li>
            <li class="col-md-4 col-xs-6"><a href="/">Courses</a></li>
		    <li class="col-md-4 col-xs-6"><a href="/">Account</a></li>

						<!-- 			"""),_display_(Seq[Any](/*72.16*/if(session.get("loggedfrom") == "getcoupons")/*72.61*/ {_display_(Seq[Any](format.raw/*72.63*/(""" -->
<!-- 			  <li class="col-md-4 bc-link hidden-xs"><a href=""""),_display_(Seq[Any](/*73.60*/play/*73.64*/.Play.application().configuration().getString("getcoupons.url"))),format.raw/*73.127*/("""" target="_blank">GetCoupons</a></li> -->
<!-- 			""")))})),format.raw/*74.10*/(""" -->
		</ul>
        </div>
      </div>
    </div>
    <div id="animatedFiller">Loading...</div>
    <div class="view-slide-in" ng-view> </div>

    </div>
    <script src=""""),_display_(Seq[Any](/*83.19*/routes/*83.25*/.Assets.at("javascripts/vendor.7793cdc8.js"))),format.raw/*83.69*/(""""></script>

    <script src=""""),_display_(Seq[Any](/*85.19*/routes/*85.25*/.Assets.at("javascripts/scripts.2b1c42bb.js"))),format.raw/*85.70*/(""""></script>
    
    <script src="js/jquery-1.11.0.min.js" type="text/javascript"></script>

    
  </body>
</html>"""))}
    }
    
    def render(node:String): play.api.templates.Html = apply(node)
    
    def f:((String) => play.api.templates.Html) = (node) => apply(node)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jun 07 18:29:29 EEST 2016
                    SOURCE: C:/Users/kubra/Desktop/OSMS/app/views/main.scala.html
                    HASH: 61b0094425bd20d06b038e53fb5e2ee7aa742ecd
                    MATRIX: 722->1|814->16|1358->524|1373->530|1435->570|1511->610|1526->616|1586->654|1647->687|1676->688|1748->733|1776->734|1886->808|1918->818|1971->836|2187->1042|2228->1044|2291->1071|2304->1075|2387->1136|2430->1148|2474->1157|2574->1248|2615->1250|2678->1277|2691->1281|2775->1343|2816->1353|3442->1943|3457->1949|3518->1988|4229->2663|4244->2669|4301->2704|4697->3064|4751->3109|4791->3111|4892->3176|4905->3180|4991->3243|5075->3295|5295->3479|5310->3485|5376->3529|5445->3562|5460->3568|5527->3613
                    LINES: 26->1|29->1|40->12|40->12|40->12|42->14|42->14|42->14|44->16|44->16|46->18|46->18|49->21|49->21|51->23|51->23|51->23|52->24|52->24|52->24|53->25|54->26|54->26|54->26|55->27|55->27|55->27|56->28|72->44|72->44|72->44|91->63|91->63|91->63|100->72|100->72|100->72|101->73|101->73|101->73|102->74|111->83|111->83|111->83|113->85|113->85|113->85
                    -- GENERATED --
                */
            