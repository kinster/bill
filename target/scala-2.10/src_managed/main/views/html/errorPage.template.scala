
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
object errorPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Throwable,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(t: Throwable):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.16*/("""

"""),_display_(Seq[Any](/*3.2*/main("Sky Bill")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/(""" 
	<div class="container">
		<div class="alert alert-info">
			An unexpected error has occurred. 
		</div>
		
		<blockquote>
			<p>"""),_display_(Seq[Any](/*10.8*/t/*10.9*/.getMessage)),format.raw/*10.20*/("""</p>
		</blockquote>
	</div>
""")))})),format.raw/*13.2*/("""



"""))}
    }
    
    def render(t:Throwable): play.api.templates.HtmlFormat.Appendable = apply(t)
    
    def f:((Throwable) => play.api.templates.HtmlFormat.Appendable) = (t) => apply(t)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Mar 05 12:50:31 GMT 2015
                    SOURCE: /Users/kinmanli/projects/bill/app/views/errorPage.scala.html
                    HASH: 66231abdbda3e739ee8e816a860ca06716a84770
                    MATRIX: 781->1|889->15|928->20|952->36|991->38|1165->177|1174->178|1207->189|1271->222
                    LINES: 26->1|29->1|31->3|31->3|31->3|38->10|38->10|38->10|41->13
                    -- GENERATED --
                */
            