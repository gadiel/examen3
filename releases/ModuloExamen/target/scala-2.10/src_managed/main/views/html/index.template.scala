
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import views.html.fomulario._


Seq[Any](format.raw/*1.19*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/message)),format.raw/*5.9*/("""

"""),_display_(Seq[Any](/*7.2*/form("Form prueba", routes.Application.prueba )/*7.49*/{_display_(Seq[Any](format.raw/*7.50*/("""
	<br>
	"""),_display_(Seq[Any](/*9.3*/textbox("textbox_prueba","defecto"))),format.raw/*9.38*/("""
	<br>
	"""),_display_(Seq[Any](/*11.3*/dropdown("ddown",List(("hola","Hola"),("que","Que"),("hace","Hace"))))),format.raw/*11.72*/("""
	<br>
	"""),_display_(Seq[Any](/*13.3*/imagen("imagen", routes.Assets.at("images/favicon.png")))),format.raw/*13.59*/("""
	<br>
	"""),_display_(Seq[Any](/*15.3*/listbox("lbox",false,List(("hola","Hola"),("que","Que"),("hace","Hace"))))),format.raw/*15.76*/("""
	<br>
	"""),_display_(Seq[Any](/*17.3*/boton("submit"))),format.raw/*17.18*/("""
""")))})))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 15 22:27:59 CST 2013
                    SOURCE: C:/Users/Gadiel/Documents/examen3/releases/ModuloExamen/app/views/index.scala.html
                    HASH: 2976aeab13f507d5bb96ea7f638f2db48d51b902
                    MATRIX: 556->1|697->18|725->51|761->53|788->60|825->63|880->110|918->111|961->120|1017->155|1061->164|1152->233|1196->242|1274->298|1318->307|1413->380|1457->389|1494->404
                    LINES: 19->1|23->1|25->4|26->5|26->5|28->7|28->7|28->7|30->9|30->9|32->11|32->11|34->13|34->13|36->15|36->15|38->17|38->17
                    -- GENERATED --
                */
            