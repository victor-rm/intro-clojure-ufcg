(ns clojure-curso-ufcg.resp03)

(defn conta
  ([n] (do (println n)) (conta (+ 1 n)))
  ([] (conta 0)))


(conta)