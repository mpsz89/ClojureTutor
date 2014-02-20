(ns BooleanAlgebra)
(use 'clojure.pprint)
(defn neg
  [a]
  (if(= a 1)
        0
        (if(= a 0)
              1
              (print "Logical value error !"))))
  
(defn uni
  [a b]
  (if(and (= a 1) (= b 1))
          1
          (if(and (= a 1) (= b 0))
              1
                  (if(and (= a 0) (= b 1))
                          1
                          (if(and (= a 0) (= b 0))
                                  0
                                  (print "Logical value error !"))))))

(defn inters
  [a b]
  (if(and (= a 1) (= b 1))
          1
          (if(and (= a 1) (= b 0))
              0
                  (if(and (= a 0) (= b 1))
                          0
                          (if(and (= a 0) (= b 0))
                                  0
                                  (print "Logical value error !"))))))

(defn assocalt
  [a b c]
  (uni a (uni b c)))

(defn assoccon
  [a b c]
  (inters a (inters b c)))

(defn commutalt
  [a b]
  (uni a b))

(defn commutcon
  [a b]
  (inters a b))

(defn absorpalt
  [a b]
  (uni a (inters a b)))

(defn absorpcon
  [a b]
  (inters a (uni a b)))

(defn distribalt
  [a b c]
  (uni a (inters b c)))

(defn distribcon
  [a b c]
  (inters a (uni b c)))

(defn complalt
  [a]
  (uni a (neg a)))

(defn complcon
  [a]
  (inters a (neg a)))

(defn demorgan1a
  [a b]
  (neg (uni a b)))

(defn demorgan1b
  [a b]
  (inters (neg a) (neg b)))

(defn demorgan2a
  [a b]
  (neg (inters a b)))

(defn demorgan2b
  [a b]
  (uni (neg a) (neg b)))

(defn compl
  [a]
  ;(use 'clojure.pprint)
  (print-table [:A :AornotA :AandnotA ] [{:A a :AornotA (complalt a) :AandnotA (complcon a)}]))

(defn commutativity
  [a b]
  (print-table [:A :B :AorB :AandB ] [{:A a :B b :AorB (commutalt a b) :AandB (commutcon a b)}]))
  
(defn absorption
  [a b]
   (print-table [:A :B :AorAandB :AandAorB ] [{:A a :B b :AorAandB (absorpalt a b) :AandAorB (absorpcon a b)}]))            

(defn demorgan1law
  [a b]
  (print-table [:A :B :notAorB :notAandB ] [{:A a :B b :notAorB (demorgan1a a b) :notAandB (demorgan1b a b)}])) 

(defn demorgan2law
  [a b]
  (print-table [:A :B :notAandB :notAornotB ] [{:A a :B b :notAandB (demorgan2a a b) :notAornotB (demorgan2b a b)}])) 

(defn associativity
  [a b c]
   (print-table [:A :B :C :AorBorC :AandBandC ] [{:A a :B b :C c :AorBorC (assocalt a b c) :AandBandC (assoccon a b c)}]))  

(defn distributivity
  [a b c]
   (print-table [:A :B :C :AorBandC :AandBorC ] [{:A a :B b :C c :AorBandC (distribalt a b c) :AandBorC (distribcon a b c)}]))        
