package controllers

import javax.inject.{Inject, Singleton}

import akka.actor.ActorSystem
import akka.stream.Materializer
import models.{ApiStream, ApiTable}
import play.api.libs.json.Json
import play.api.mvc._

/**
  * This controller handles creating and describing tables.
  */
@Singleton
class TableController @Inject()(cc: ControllerComponents)
  extends AbstractController(cc) {

  def get(id: String) = Action { implicit request: Request[AnyContent] =>
    // TODO: get the table here!
    Ok(Json.toJson(ApiTable("retrievedTable", List.empty)))
  }

  def create() = Action { implicit request: Request[AnyContent] =>
    // TODO: create the stream here!
    Ok(Json.toJson(ApiTable("newTable", List.empty)))
  }

  def all() = Action { implicit request: Request[AnyContent] =>
    // TODO: list all streams!
    Ok(Json.toJson(List.empty[ApiTable]))
  }

}

