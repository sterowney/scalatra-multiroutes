package com.example.app

import org.scalatra._

class ContinentsServlet extends ScalatraFilter {

  get("/continents") {
    "all continents"
  }

  get("/continents/:continentId") {
    "specific continents"
  }

}
