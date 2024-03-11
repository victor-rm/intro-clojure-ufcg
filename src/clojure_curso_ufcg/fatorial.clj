(ns clojure-curso-ufcg.fatorial)

(println "Digite o número para calcular seu fatorial")

(defn fatorial [n]
  (if (= n 1)
   (* 1)
   (* n (fatorial(- n 1)))))

(println(fatorial (read)))
