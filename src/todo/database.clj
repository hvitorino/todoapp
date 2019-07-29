(ns todo.database
  (:require [korma.db :as korma]))

(def db-connection-info
  (korma/mysql
    {:classname "com.mysql.jdbc.Driver"
     :subprotocol "mysql"
     :host "localhost"
     :user "root"
     :password "admin"
     :subname "//localhost:3306/todo"}))

; set up korma
(korma/defdb db db-connection-info)