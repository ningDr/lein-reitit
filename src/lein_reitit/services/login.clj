(ns lein-reitit.services.login)

(defn auth
  [{:keys [username password] :as params}]
  (println "params is =" params)
  {:status 200
   :body {:success (and (= username "test") (= password "123456"))}})