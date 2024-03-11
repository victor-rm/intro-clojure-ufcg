(ns clojure-curso-ufcg.eq2)


(defn delta
  [a b c] (+ (* b b) (* 4 a c)))

(defn bhaskara-raiz [a b c o]
  (/ (o (- b) (Math/sqrt (delta a b c))) (* 2 a)))

(defn raizes [a b c]
  (if (>= (delta a b c) 0)
    (println (bhaskara-raiz a b c +) (bhaskara-raiz a b c -))
    (println "sem raizes\n")))

(println "Digite os valores a b c")
(raizes (read) (read) (read))