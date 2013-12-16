
package views.html.fomulario

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
object listbox extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Boolean,List[scala.Tuple2[String, String]],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(name: String, multiple: Boolean = false, values: List[(String, String)]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.75*/("""
<select name=""""),_display_(Seq[Any](/*2.16*/name)),format.raw/*2.20*/("""" 
"""),_display_(Seq[Any](/*3.2*/if(multiple==false)/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
	multiple="multiple" 
""")))}/*5.3*/else/*5.8*/{_display_(Seq[Any](format.raw/*5.9*/("""
	size="4" 
""")))})),format.raw/*7.2*/("""
>
"""),_display_(Seq[Any](/*9.2*/for((valor, texto) <- values) yield /*9.31*/ {_display_(Seq[Any](format.raw/*9.33*/("""
	<option value=""""),_display_(Seq[Any](/*10.18*/valor)),format.raw/*10.23*/("""">"""),_display_(Seq[Any](/*10.26*/texto)),format.raw/*10.31*/("""</option>
""")))})),format.raw/*11.2*/("""
</select>"""))}
    }
    
    def render(name:String,multiple:Boolean,values:List[scala.Tuple2[String, String]]): play.api.templates.HtmlFormat.Appendable = apply(name,multiple,values)
    
    def f:((String,Boolean,List[scala.Tuple2[String, String]]) => play.api.templates.HtmlFormat.Appendable) = (name,multiple,values) => apply(name,multiple,values)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 15 22:28:00 CST 2013
                    SOURCE: C:/Users/Gadiel/Documents/examen3/releases/ModuloExamen/app/views/fomulario/listbox.scala.html
                    HASH: 75a546abe90505946d27098a5052e8d45b622b91
                    MATRIX: 611->1|778->74|829->90|854->94|892->98|919->117|958->119|999->144|1010->149|1047->150|1090->163|1128->167|1172->196|1211->198|1265->216|1292->221|1331->224|1358->229|1400->240
                    LINES: 19->1|22->1|23->2|23->2|24->3|24->3|24->3|26->5|26->5|26->5|28->7|30->9|30->9|30->9|31->10|31->10|31->10|31->10|32->11
                    -- GENERATED --
                */
            