
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
object pageNotFound extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main("Sky Bill")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/(""" 
	<div class="container">
		<div class="alert alert-info">
			Sorry, that page does not exist.  
		</div>
		
		<blockquote>
			<p>"""),_display_(Seq[Any](/*10.8*/message)),format.raw/*10.15*/("""</p>
		</blockquote>

	</div>
""")))})))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Mar 05 12:50:31 GMT 2015
                    SOURCE: /Users/kinmanli/projects/bill/app/views/pageNotFound.scala.html
                    HASH: 32eefd25f06c4e0ba51dcf7fc89d5ae2940b919b
                    MATRIX: 781->1|892->18|931->23|955->39|994->41|1168->180|1197->187
                    LINES: 26->1|29->1|31->3|31->3|31->3|38->10|38->10
                    -- GENERATED --
                */
            