(ns lein-reitit.routes.login
  (:require [lein-reitit.services.login :as login]))

(def login
  ["/login"
   {:swagger {:tags ["login api"]}}
   ["/auth"
    {:post {:summary "verify user's password"
            :parameters {:body {:username string?, :password string?}}
            :responses {200 {:body {:success boolean?}}}
            :handler #(login/auth (get-in % [:parameters :body]))}}]])
