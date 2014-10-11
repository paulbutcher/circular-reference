(ns annotator.core
  (:require [compojure.core :refer [defroutes]]
            [compojure.handler :refer [site]]
            [compojure.route :refer [not-found]]))

(defroutes app-routes
  (not-found "Page not found"))

(def handler (site app-routes))
