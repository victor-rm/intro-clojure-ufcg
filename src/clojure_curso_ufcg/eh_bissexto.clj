(ns clojure-curso-ufcg.eh-bissexto)

(defn eh_bissexto [x] (= (mod x 400) 0))


(if (eh_bissexto (read))
                 (println "É bissexto")
                 (println "Não é bissexto"))