(defproject incident-traces-server "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [
    [org.clojure/clojure "1.6.0"]
    [compojure "1.3.1"]
    [ring/ring-defaults "0.1.2"]
    [environ  "1.0.0"]
    [org.clojure/java.jdbc  "0.3.2"]
    [postgresql  "9.1-901.jdbc4"]
    [migratus  "0.8.2"]
  ]
  :plugins [[lein-ring "0.8.13"]]
  :ring {:handler incident-traces-server.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
