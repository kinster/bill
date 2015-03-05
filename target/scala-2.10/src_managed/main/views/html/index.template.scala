
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,models.Bill,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String, bill: models.Bill):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.38*/(""" 

"""),_display_(Seq[Any](/*3.2*/main("Sky Bill")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/(""" 

	<div class="container">
		<div class="row heading">
			<div class="col-sm-12 col-md-12">
				<img src="assets/images/skylogo.png" class="img-responsive" alt="Sky Logo">
			</div>
		</div>
		<div class="row heading">
			<div class="col-sm-4 col-md-4 text-left">
				<h2>"""),_display_(Seq[Any](/*13.10*/message)),format.raw/*13.17*/("""</h2>
			</div>
			<div class="col-sm-8 col-md-8 text-right">
				<h2>Date: """),_display_(Seq[Any](/*16.16*/bill/*16.20*/.getStatement().getGenerated())),format.raw/*16.50*/("""</h2>
			</div>
		</div>
		
		<div class="jumbotron">
			<h2>Total Amount Due ("""),_display_(Seq[Any](/*21.27*/bill/*21.31*/.getStatement().getDueDate())),format.raw/*21.59*/(""") <span id="complete-total">"""),_display_(Seq[Any](/*21.88*/bill/*21.92*/.toPriceString())),format.raw/*21.108*/("""</span></h2>
		</div>
		
		<div class="row">
			<div class="col-sm-12 col-md-12">
				<div class="panel">
				  <div class="panel-body">
					<h4>Period: """),_display_(Seq[Any](/*28.19*/bill/*28.23*/.getStatement().getPeriod().getFrom())),format.raw/*28.60*/(""" to """),_display_(Seq[Any](/*28.65*/bill/*28.69*/.getStatement().getPeriod().getTo())),format.raw/*28.104*/("""</h4>
				  </div>
				</div>
			</div>
		</div>
		
		<div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
			<div class="panel panel-default">
				<div class="panel-heading" role="tab" id="headingOne">
					<div class="text-left">
						<h3 class="panel-title">
							<a data-toggle="collapse" data-parent="#accordion"
								href="#subscriptions" aria-expanded="true"
								aria-controls="subscriptions" id="subscription-link">Subscriptions</a>
						</h3>
					</div>
				</div>
				<div id="subscriptions" class="panel-collapse collapse in"
					role="tabpanel" aria-labelledby="headingOne">
					<div class="panel-body">
						"""),_display_(Seq[Any](/*48.8*/for(subscription <- bill.getPackageSubscriptions().getSubscriptions()) yield /*48.78*/ {_display_(Seq[Any](format.raw/*48.80*/("""
							<div class="col-sm-4 col-md-4 text-left">
								"""),_display_(Seq[Any](/*50.10*/subscription/*50.22*/.getType())),format.raw/*50.32*/("""							
							</div>						
							<div class="col-sm-4 col-md-4 text-left">
								"""),_display_(Seq[Any](/*53.10*/subscription/*53.22*/.getName())),format.raw/*53.32*/("""							
							</div>						
					  		<div class="col-sm-4 col-md-4 text-right">
					  			"""),_display_(Seq[Any](/*56.12*/subscription/*56.24*/.toPriceString())),format.raw/*56.40*/("""
					  		</div>
						""")))})),format.raw/*58.8*/("""	
										
						<div class="col-sm-8 col-md-8 text-left">
							<h4>Package Total</h4>
						</div>
					  	<div class="col-sm-4 col-md-4 text-right">
							<h4 id="subscriptions-total">"""),_display_(Seq[Any](/*64.38*/bill/*64.42*/.getPackageSubscriptions.toPriceString())),format.raw/*64.82*/("""</h4>
						</div>
					</div>
				</div>
			</div>
			<div class="panel panel-default">
				<div class="panel-heading" role="tab" id="headingTwo">
					<h4 class="panel-title">
						<a class="collapsed" data-toggle="collapse" data-parent="#accordion"
							href="#callCharges" aria-expanded="false"
							aria-controls="callCharges" id="call-charges-link">Call Charges</a>
					</h4>
				</div>
				<div id="callCharges" class="panel-collapse collapse" role="tabpanel"
					aria-labelledby="headingTwo">
					<div class="panel-body">
						"""),_display_(Seq[Any](/*80.8*/for(call <- bill.getCallCharges().getCalls()) yield /*80.53*/ {_display_(Seq[Any](format.raw/*80.55*/("""
							<div class="col-sm-4 col-md-4 text-left">
								"""),_display_(Seq[Any](/*82.10*/call/*82.14*/.getCalled())),format.raw/*82.26*/("""							
							</div>						
							<div class="col-sm-4 col-md-4 text-left">
								"""),_display_(Seq[Any](/*85.10*/call/*85.14*/.getDuration())),format.raw/*85.28*/("""							
							</div>						
					  		<div class="col-sm-4 col-md-4 text-right">
					  			"""),_display_(Seq[Any](/*88.12*/call/*88.16*/.toPriceString())),format.raw/*88.32*/("""
					  		</div>
						""")))})),format.raw/*90.8*/("""
						<div class="col-sm-8 col-md-8 text-left">
							<h4>Call Charges Total</h4>
						</div>
					  	<div class="col-sm-4 col-md-4 text-right">
							<h4 id="callchargestotal">"""),_display_(Seq[Any](/*95.35*/bill/*95.39*/.getCallCharges.toPriceString())),format.raw/*95.70*/("""</h4>
						</div>
					</div>
				</div>
			</div>
			<div class="panel panel-default">
				<div class="panel-heading" role="tab" id="headingThree">
					<h4 class="panel-title">
						<a class="collapsed" data-toggle="collapse" data-parent="#accordion"
							href="#skyStore" aria-expanded="false"
							aria-controls="headingThree" id="sky-store-link">Sky Store</a>
					</h4>
				</div>
				<div id="skyStore" class="panel-collapse collapse" role="tabpanel"
					aria-labelledby="headingThree">
					<div class="panel-body">
						<h4>Rentals</h4>
						"""),_display_(Seq[Any](/*112.8*/for(rental <- bill.getSkyStore.getRentals()) yield /*112.52*/ {_display_(Seq[Any](format.raw/*112.54*/("""
							<div class="col-sm-8 col-md-8 text-left">
								<p>"""),_display_(Seq[Any](/*114.13*/rental/*114.19*/.getTitle())),format.raw/*114.30*/("""</p>						
							</div>						
					  		<div class="col-sm-4 col-md-4 text-right">
					  			<p>"""),_display_(Seq[Any](/*117.15*/rental/*117.21*/.toPriceString())),format.raw/*117.37*/("""</p>
					  		</div>
						""")))})),format.raw/*119.8*/("""
						<h4>Buy and Keep</h4>
						"""),_display_(Seq[Any](/*121.8*/for(buyAndKeep <- bill.getSkyStore().getBuyAndKeep()) yield /*121.61*/ {_display_(Seq[Any](format.raw/*121.63*/("""
							<div class="col-md-8 text-left">
								<p>"""),_display_(Seq[Any](/*123.13*/buyAndKeep/*123.23*/.getTitle())),format.raw/*123.34*/("""</p>
							</div>						
					  		<div class="col-md-4 text-right">
					  			<p>"""),_display_(Seq[Any](/*126.15*/buyAndKeep/*126.25*/.toPriceString())),format.raw/*126.41*/("""</p>
					  		</div>
						""")))})),format.raw/*128.8*/("""
						<div class="col-sm-8 col-md-8 text-left">
							<h4>Sky Store Total</h4>
						</div>
					  	<div class="col-sm-4 col-md-4 text-right">
							<h4 id="sky-store-total">"""),_display_(Seq[Any](/*133.34*/bill/*133.38*/.getSkyStore().toPriceString())),format.raw/*133.68*/("""</h4>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
""")))})),format.raw/*140.2*/("""
"""))}
    }
    
    def render(message:String,bill:models.Bill): play.api.templates.HtmlFormat.Appendable = apply(message,bill)
    
    def f:((String,models.Bill) => play.api.templates.HtmlFormat.Appendable) = (message,bill) => apply(message,bill)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Mar 05 12:50:31 GMT 2015
                    SOURCE: /Users/kinmanli/projects/bill/app/views/index.scala.html
                    HASH: 9ac91672c0737416045dc833ac27d5fcc5b6ef65
                    MATRIX: 786->1|916->37|954->41|978->57|1017->59|1327->333|1356->340|1469->417|1482->421|1534->451|1650->531|1663->535|1713->563|1778->592|1791->596|1830->612|2021->767|2034->771|2093->808|2134->813|2147->817|2205->852|2908->1520|2994->1590|3034->1592|3129->1651|3150->1663|3182->1673|3304->1759|3325->1771|3357->1781|3484->1872|3505->1884|3543->1900|3598->1924|3826->2116|3839->2120|3901->2160|4481->2705|4542->2750|4582->2752|4677->2811|4690->2815|4724->2827|4846->2913|4859->2917|4895->2931|5022->3022|5035->3026|5073->3042|5128->3066|5346->3248|5359->3252|5412->3283|6009->3844|6070->3888|6111->3890|6210->3952|6226->3958|6260->3969|6394->4066|6410->4072|6449->4088|6509->4116|6581->4152|6651->4205|6692->4207|6782->4260|6802->4270|6836->4281|6955->4363|6975->4373|7014->4389|7074->4417|7289->4595|7303->4599|7356->4629|7458->4699
                    LINES: 26->1|29->1|31->3|31->3|31->3|41->13|41->13|44->16|44->16|44->16|49->21|49->21|49->21|49->21|49->21|49->21|56->28|56->28|56->28|56->28|56->28|56->28|76->48|76->48|76->48|78->50|78->50|78->50|81->53|81->53|81->53|84->56|84->56|84->56|86->58|92->64|92->64|92->64|108->80|108->80|108->80|110->82|110->82|110->82|113->85|113->85|113->85|116->88|116->88|116->88|118->90|123->95|123->95|123->95|140->112|140->112|140->112|142->114|142->114|142->114|145->117|145->117|145->117|147->119|149->121|149->121|149->121|151->123|151->123|151->123|154->126|154->126|154->126|156->128|161->133|161->133|161->133|168->140
                    -- GENERATED --
                */
            