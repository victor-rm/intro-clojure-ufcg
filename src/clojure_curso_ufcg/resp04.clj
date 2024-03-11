(ns clojure-curso-ufcg.resp04)

(defn conta []
  (loop [n 0]
    (println n)
    (recur (+ 1 n))))

(conta)

;; Não há mais o erro de stackoverflow 
;; pois não estamos mais utilizando a pilha da LSP 
;; como estávamos antes. De maneira iterativa estamos 
;; adicionando e imprimindo valores imediamente 
;; sem armazena-los.