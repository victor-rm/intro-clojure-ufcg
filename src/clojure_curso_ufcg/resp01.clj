(ns clojure-curso-ufcg.resp01)

(defn msg-rec [msg]
  (println msg)
  (msg-rec msg))

(println (msg-rec (read)))
