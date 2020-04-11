(ns user
  (:require [lein-reitit.core :as core]
            [ring.adapter.jetty :as jetty]))

(defn start
  []
  (println "starting dev")
  (jetty/run-jetty #'core/app {:port 3000, :join? false}))

