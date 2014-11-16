;Michał Piotr Szmigiel
;Clojure 1.6.0
;16 listopada 2014 r.
;Liczby zespolone w Clojure

(ns complex)

;Tworzenie funkcji liczby zespolonej
(defn complex
  [re im]
  (if(and (= re 0) (>= im 0))
          (str im"j")
          (if(and (= re 0) (< im 0))
                    (str im"j")
                    (if(and (< re 0) (< im 0))
                              (str "("re""im"j)")
                            (if(and (> re 0) (< im 0))
                                    (str "("re""im"j)")
                                    (str "("re"+"im"j)"))))))

;Tworzenie funkcji planarnej liczby zespolonej
(defn planar_complex
  [a1 a2 b1 b2]
  (complex (+ a1 b1) (+ a2 b2)))

;Tworzenie funkcji sumy liczby zespolonej
(defn add_complex
  [a1 a2 b1 b2]
  (complex (+ a1 a2) (+ b1 b2)))

;Tworzenie funkcji różnicy liczby zespolonej
(defn sub_complex
  [a1 a2 b1 b2]
  (complex (- a1 a2) (- b1 b2)))

;Tworzenie funkcji iloczynu liczby zespolonej
(defn mult_complex
  [a1 a2 b1 b2]
  (complex (- (* a1 a2) (* b1 b2) ) (+ (* a1 b2) (* a2 b1) )))

;Tworzenie funkcji ilorazu liczby zespolonej
(defn div_complex
  [a1 a2 b1 b2]
  (complex (/ (- (* a1 a2) (* b1 b2)) (+ (* a2 a2) (* b2 b2))  )  (/ (+ (* a1 b2) (* a2 b1)) (+ (* a2 a2) (* b2 b2))  ) ))

;Tworzenie funkcji modułu liczby zespolonej
(defn modulus
  [re im]
  (Math/sqrt (+ (* re re) (* im im))))

;Tworzenie funkcji argumentu liczby zespolonej
(defn argument [re im]
  (if (> re 0) (Math/atan (/ im re))
    (if (and (< re 0) (>= im 0)) (+ Math/PI (Math/atan (/ im re)))
      (if (and (< re 0) (< im 0)) (- Math/PI (Math/atan (/ im re)))
        (if (and (= re 0) (> im 0)) (/ Math/PI 2)
          (if (and (= re 0) (< im 0)) (* (-1) (/ Math/PI 2)) "indeterminate"))))))
