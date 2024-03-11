(ns clojure-curso-ufcg.eh-triangulo)

(defn eh_triangulo [a b c] (and 
                            (> (+ a b) c)
                            (> (+ b c) a)
                            (> (+ a c) b)))

(if (eh_triangulo (read) (read) (read))
  (println "É um triangulo")
  (println "Não é triangulo"))