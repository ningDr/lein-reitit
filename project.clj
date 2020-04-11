(require 'cemerick.pomegranate.aether)
(cemerick.pomegranate.aether/register-wagon-factory!
 "http" #(org.apache.maven.wagon.providers.http.HttpWagon.))

(defproject lein-reitit "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [aero "1.1.6"] #_"read config"
                 [javax.servlet/javax.servlet-api "4.0.1"]
                 [ring/ring-jetty-adapter "1.8.0"]
                 [metosin/reitit "0.4.2"] #_"routes"]
  :repl-options {:init-ns lein-reitit.core}
  :profiles {:dev {:source-paths   ["env/dev/clj"]
                   :resource-paths ["env/dev/resources"]}
             :prod {:resource-paths ["env/prod/resources"]}}
  :main lein-reitit.core/start
  :aliases {"reitit"  ["do" "clean" ["with-profile" "prod" "uberjar"]]}
  :repositories [["aliyun" "http://maven.aliyun.com/nexus/content/groups/public"]
                 ["clojars" "https://mirrors.tuna.tsinghua.edu.cn/clojars/"]])
