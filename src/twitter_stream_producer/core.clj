(ns twitter-stream-producer.core
  (:gen-class)
  (:require [liberator.core :refer [resource defresource]]
            [ring.middleware.params :refer [wrap-params]]
            [compojure.core :refer [defroutes GET]]))

(def tweets (read-string (slurp "tweets.clj")))

(defresource get-tweets [n]
             :available-media-types ["application/clojure;q=0.9"]
             :handle-ok (fn [_] (take (Integer. n) tweets)))

(defroutes app
           (GET "/tweets/:n{[0-9]+}" [n] (get-tweets n))
           (GET "/" [] (get-tweets 100)))

(def handler
  (-> app
      wrap-params))