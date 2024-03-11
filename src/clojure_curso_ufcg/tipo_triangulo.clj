(ns clojure-curso-ufcg.tipo-triangulo)

(defn isosceles [a b c]
  (or (= a b)
      (= b c)
      (= a c)))

(defn equilatero [a b c]
  (= a b c))

(defn tipo_triangulo [a b c] 
  (cond
    (equilatero a b c) :equilátero
    (isosceles a b c) :isósceles
    :else :escaleno))

(println (tipo_triangulo (read) (read) (read)))
