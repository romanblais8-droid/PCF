grammar PCF;

//symboles non terminaux : minuscule ; types de lexème : majuscule (première lettre au moins)
//Expressions ordonnées par ordre de priorité

exp: 'fun' VAR '->' exp                 # Fun
   | 'let' VAR '=' exp 'in' exp         # Let
   | 'ifz' exp 'then' exp 'else' exp    # IfZero
   | sum                                # FromSum
   ;

sum: sum OP2 product                    # BinaryExp2
   | product                            # SumTerm
   ;

product: product OP1 application        # BinaryExp1
       | application                    # ProductTerm
       ;

application: application atom          # App
           | atom                       # ApplicationTerm
           ;

atom: NUMBER                            # Number
    | '(' exp ')'                       # ParExp
    | VAR                               # Var
   ;

NUMBER: '0' | [1-9][0-9]* ;
OP1: '*' | '/' ;
OP2: '+' | '-' ;
WS : [ \r\t\n]+ -> skip ;
VAR : [a-z][a-z0-9]* ;
