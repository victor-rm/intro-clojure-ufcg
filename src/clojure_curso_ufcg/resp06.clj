(ns clojure-curso-ufcg.resp06)

(defn conta []
  (doseq [n (range 0 (read))]
    (println n)))

(conta)