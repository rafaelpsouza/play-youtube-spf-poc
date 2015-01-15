package controllers

import play.api._
import play.api.mvc._
import play.api.libs.json._

object Application extends Controller {
  
  def page1 = Action { implicit request =>
    Logger.info(request.toString)
    Ok(views.html.page1("Page 1"))
    
  }

  def page2 = Action { implicit request =>
    Logger.info(request.toString)
      Ok(views.html.page2("Page 2"))
  }

}

