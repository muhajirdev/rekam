(ns rekam.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [rekam.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[rekam started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[rekam has shut down successfully]=-"))
   :middleware wrap-dev})
