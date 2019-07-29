(ns todo.query
  (:require [todo.database]
            [korma.core :refer :all]))

(defentity items)

(defn get-todos []
  (select items))

(defn add-todo [title description]
  (insert items
          (values {:title title :description description})))

(defn delete-todo [id]
  (delete items
          (where {:id [= id]})))

(defn update-todo [id title description]
  (update items
          (set-fields {:title title :description description})
          (where {:id [= id]})))

(defn get-todo [id]
  (first
    (select items
            (where {:id [= id]}))))