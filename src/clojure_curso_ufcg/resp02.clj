(ns clojure-curso-ufcg.resp02)

(defn conta-rec [number]
  (println number)
  (conta-rec (+ 1 number)))

(defn conta []
  (conta-rec 0))

(conta)