(defproject twitter-stream-producer "0.1.0-SNAPSHOT"
  :description "Example of a Twitter stream producer."
  :url "http://localhost:3000/"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-ring "0.12.2"]]
  :ring {:handler twitter-stream-producer.core/handler}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [liberator "0.15.1"]
                 [compojure "1.6.0"]
                 [ring/ring-core "1.6.3"]]
  :main ^:skip-aot twitter-stream-producer.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
