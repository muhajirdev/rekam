(ns rekam.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[rekam started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[rekam has shut down successfully]=-"))
   :middleware identity})
