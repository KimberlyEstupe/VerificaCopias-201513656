package Analizadores;
import static Analizadores.Tokenjs.*;
%%
%class LexiJS
%type Tokenjs
%line
%column
%init{
    yyline = 1;
    yycolumn = 1;
%init}


L = [a-zA-Z_]+
D = [0-9]+
N = [0-9]+("."[0-9]+)?
C = \"[^\"]*\" /*cadena*/
ID =({L}|("_"{L}))({L}|{D}|"_")*
COMM = [\/][\*]((.)|"\n")*[\*][\/]
CHA = [\'](.)[\']

espacio=[ |\t|\r]+
%{
    public String Lexejs;
    public int Lineajs;
    public int Colujs;
%}
%%

("\n") { yycolumn = 1; }
/*() {Lexejs=yytext();Lineajs =yyline;Colujs=yycolumn;  return ;}*/
{espacio} {/*Ignore*/}

/* Comentarios */
( [\/][\/](.)* ) {Lexejs=yytext(); Lineajs =yyline; Colujs=yycolumn;  return COMENTARIO;}
{COMM} {Lexejs= yytext(); Lineajs =yyline; Colujs=yycolumn; return COM_MULTILINEA;}

(class) {Lexejs=yytext(); Lineajs =yyline; Colujs=yycolumn; return Clase;}
(do) {Lexejs=yytext(); Lineajs =yyline; Colujs=yycolumn; return Do;}
(while) {Lexejs=yytext(); Lineajs =yyline; Colujs=yycolumn; return While;}
(if) {Lexejs=yytext(); Lineajs =yyline; Colujs=yycolumn; return If;}
(else) {Lexejs=yytext(); Lineajs =yyline; Colujs=yycolumn; return Else;}
(var | let | const) {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn;  return Variable;}
(llamada){D} {Lexejs=yytext(); Lineajs =yyline; Colujs=yycolumn; return Llamada;}
(for) {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return For;}
(switch) {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Switch;}
(break) {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Break;}
(require) {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Require;}
(true)      {Lexejs = yytext();Lineajs =yyline; Colujs=yycolumn; return True;}
(false)      {Lexejs = yytext();Lineajs =yyline; Colujs=yycolumn; return False;}
(console) {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Console;}
(log) {Lexejs=yytext(); Lineajs =yyline; Colujs=yycolumn; return Log;}
(default) {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Default;}
(case) {Lexejs=yytext(); Lineajs =yyline; Colujs=yycolumn; return Case;}

( "=" ) {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Igual;}
( "+" ) {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Suma;}
( "-" ) {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Resta;}
( "*" ) {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Multiplicacion;}
( "/" ) {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Division;}
( "%" ) {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Modulo;}

( "(" ) {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return ParentesisA;}
( ")" ) {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return ParentesisC;}
( "{" ) {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return LlaveA;}
( "}" ) {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return LlaveC;}

("&&") {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return And;}
("||") {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Or;}
("!") {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Not;}

(">") {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Mayor;}
("<") {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Menor;}
("==") {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Igualacion;}
("!=") {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Negacion;}
(">=") {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Mayor_Igual;}
("<=") {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Menor_Igual;}

("++") {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Incremente;}
("--") {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Decremento;}

(";") {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Punto_y_coma;}
(".") {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Punto;}
("\,") {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Coma;}
(":") {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Dos_Puntos;}

{C} {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Cadena;}
{ID} {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Identificador;}
{N} {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Numero;}
{CHA} {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return Char;}

/* Error de analisis */
 . {Lexejs=yytext();Lineajs =yyline; Colujs=yycolumn; return ERROR;}