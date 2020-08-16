(ns example
  (:require
    [datomic.client.api :as d]))

(comment
  (d/client {:endpoint    "",
             :server-type :ion,
             :region      "",
             :system      ""})
  )