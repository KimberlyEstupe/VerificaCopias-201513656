package Analizadores;
import java_cup.runtime.Symbol;
%%
%class LexiJSCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%column
L = [a-zA-Z_]+
D = [0-9]+
N = [0-9]+("."[0-9]+)?
ID =({L}|("_"{L}))({L}|{D}|"_")*
C = \"[^\"]*\" /*cadena*/
COMM = [\/][\*]((.)|"\n")*[\*][\/]
CHA = [\'](.)[\']
espacio=[ |\t|\r]+

%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}

%%
/*--------------------- IGNORA --------------------------------------------------------*/
("\n") { }
{espacio} {/*Ignore*/}
( [\/][\/](.)* ) {/* Comentario */}
{COMM} {/* Comentario */}

/*   ("")        {return new Symbol(sym., yycolumn, yyline, yytext());}   */

/*--------------------- PALABRAS RESERVADAS --------------------------------------------------------*/
(class)             {return new Symbol(sym.Clase, yycolumn, yyline, yytext());}
(do)                {return new Symbol(sym.Do, yycolumn, yyline, yytext());}
(while)             {return new Symbol(sym.While, yycolumn, yyline, yytext());}
(if)                {return new Symbol(sym.If, yycolumn, yyline, yytext());}
(else)              {return new Symbol(sym.Else, yycolumn, yyline, yytext());}
(var | let | const) {return new Symbol(sym.Variable, yycolumn, yyline, yytext());}
(llamada){D}        {return new Symbol(sym.Llamada, yycolumn, yyline, yytext());}
(for)               {return new Symbol(sym.For, yycolumn, yyline, yytext());}
(switch)            {return new Symbol(sym.Switch, yycolumn, yyline, yytext());}
(break)             {return new Symbol(sym.Break, yycolumn, yyline, yytext());}
(require)           {return new Symbol(sym.Require, yycolumn, yyline, yytext());}
(true | false)      {return new Symbol(sym.Bool, yycolumn, yyline, yytext());}   
(console)           {return new Symbol(sym.Console, yycolumn, yyline, yytext());}
(log)               {return new Symbol(sym.Log, yycolumn, yyline, yytext());}
(default)           {return new Symbol(sym.Default, yycolumn, yyline, yytext());}
(case)              {return new Symbol(sym.Case, yycolumn, yyline, yytext());}

("&&" | "||" | "!")                             {return new Symbol(sym.Logico, yycolumn, yyline, yytext());}
("*" | "/" | "%")                               {return new Symbol(sym.Matematico, yycolumn, yyline, yytext());}
("+")                                           {return new Symbol(sym.Suma, yycolumn, yyline, yytext());}
("-")                                           {return new Symbol(sym.Resta, yycolumn, yyline, yytext());}
("=")                                           {return new Symbol(sym.Igual, yycolumn, yyline, yytext());}
("<" | ">" | "==" | "!=" | ">=" | "<=")         {return new Symbol(sym.Relacionales, yycolumn, yyline, yytext());}
("++" | "--")                                   {return new Symbol(sym.Incremento, yycolumn, yyline, yytext());}

("(")        {return new Symbol(sym.ParenA, yycolumn, yyline, yytext());}
(")")        {return new Symbol(sym.ParenC, yycolumn, yyline, yytext());}
("{")        {return new Symbol(sym.LlaveA, yycolumn, yyline, yytext());}
("}")        {return new Symbol(sym.LlaveC, yycolumn, yyline, yytext());}

(".")        {return new Symbol(sym.Punto, yycolumn, yyline, yytext());}
(";")        {return new Symbol(sym.PComa, yycolumn, yyline, yytext());}
(":")        {return new Symbol(sym.DPuntos, yycolumn, yyline, yytext());}
(",")        {return new Symbol(sym.Coma, yycolumn, yyline, yytext());}

{C}     {return new Symbol(sym.Cadena, yycolumn, yyline, yytext());}
{N}     {return new Symbol(sym.Numero, yycolumn, yyline, yytext());}
{ID}    {return new Symbol(sym.Identificador, yycolumn, yyline, yytext());}
{CHA}   {return new Symbol(sym.Char, yycolumn, yyline, yytext());}

/* Error de analisis */
 . {}