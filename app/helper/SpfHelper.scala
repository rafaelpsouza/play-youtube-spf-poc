package helper

import play.twirl.api.Html
import play.api.libs.json.Json
import play.api.libs.json.JsValue
import play.api.mvc.Request

object SpfHelper {

  def toJson(title: String)(head:Html)(content:Html)(footer:Html):Html ={
    val json: JsValue = Json.obj(
        "title" -> title,
        "head" -> head.toString, 
        "body" -> Json.obj("content" ->content.toString), 
        "foot" -> footer.toString)
    Html(json.toString)
  }
  
  def isNavigation()(implicit request:Request[_]):Boolean = request.getQueryString("spf").isDefined
}