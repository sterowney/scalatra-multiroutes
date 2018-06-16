package com.example.app

import org.scalatra._

class CountriesServlet extends ScalatraFilter {

  get("/continents/:continentId/countries") {
    "countries"
  }
}
