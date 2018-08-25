
package Analizador;
import java_cup.runtime.Symbol;
import proyecto1compi.*;
import Listas.*;
%%
%cupsym sym
%class Lexico
%cup
%public
%unicode
%line
%column
%char
%ignorecase
%full


//------------------------------------------------------------------------
//EXPRESIONES REGULARES

letra			=			[a-zA-ZÑñ_]
digito			=			[0-9]

valor_numerico          =			[0-9]+ 
correo                  =                       ({letra}|{digito})+\@({letra}|{digito})+\."com"
iden			=			{letra}+({letra}|{digito})*
cadena			=			[\"] [^\"\n]* [\"\n]
and                     =                       \%\%
or                      =                       \#\#


//-------------------------------------------------------------------------

%{
    //codigo de java
    String nombre;
   /* public void imprimir(String dato,String cadena){
    	System.out.println(dato+" : "+cadena);
    }*/
    public void imprimir(String cadena){
    	System.out.println(cadena+" soy reservada");
    }
%}

%%

//RESERVADAS
"request"            {return new Symbol(sym.req,yycolumn,yyline,yytext());} 
"iniciousuario"      {return new Symbol(sym.iniciou,yycolumn,yyline,yytext());} 
"crearusuario"       {return new Symbol(sym.crearu,yycolumn,yyline,yytext());} 
"tienda"             {return new Symbol(sym.tienda,yycolumn,yyline,yytext());} 
"producto"           {return new Symbol(sym.producto,yycolumn,yyline,yytext());}
"true"               {return new Symbol(sym.verdadero,yycolumn,yyline,yytext());}
"false"              {return new Symbol(sym.falso,yycolumn,yyline,yytext());}
"get"		     {return new Symbol(sym.get,yycolumn,yyline,yytext());}
"query"		     {return new Symbol(sym.query,yycolumn,yyline,yytext());}
"extraer"            {return new Symbol(sym.extraer,yycolumn,yyline,yytext());}
"de"		     {return new Symbol(sym.de,yycolumn,yyline,yytext());}
"donde"		     {return new Symbol(sym.donde,yycolumn,yyline,yytext());}
"rq"		     {return new Symbol(sym.rq,yycolumn,yyline,yytext());}
"ptn"		     {return new Symbol(sym.ptn,yycolumn,yyline,yytext());}
"n"		     {return new Symbol(sym.n,yycolumn,yyline,yytext());}
"usuario"	     {return new Symbol(sym.usuario,yycolumn,yyline,yytext());}
    
//SIMBOLOS

"$"                  {return new Symbol(sym.dolar,yycolumn,yyline,yytext());}   
"-"                  {return new Symbol(sym.menos,yycolumn,yyline,yytext());} 
"="                  {return new Symbol(sym.igual,yycolumn,yyline,yytext());}  
","                  {return new Symbol(sym.coma,yycolumn,yyline,yytext());}  
";"                  {return new Symbol(sym.pyc,yycolumn,yyline,yytext());}  
"("                  {return new Symbol(sym.pabre,yycolumn,yyline,yytext());}  
")"                  {return new Symbol(sym.pcierra,yycolumn,yyline,yytext());}  
"{"                  {return new Symbol(sym.llabre,yycolumn,yyline,yytext());}  
"}"                  {return new Symbol(sym.llcierra,yycolumn,yyline,yytext());}  
"/"                  {return new Symbol(sym.barra,yycolumn,yyline,yytext());}  
"+"                  {return new Symbol(sym.mas,yycolumn,yyline,yytext());}  
"*"                  {return new Symbol(sym.multiplica,yycolumn,yyline,yytext());}  



{valor_numerico}     {return new Symbol(sym.valorNumerico,yycolumn,yyline,yytext());}
{cadena}             {return new Symbol(sym.cadena,yycolumn,yyline,yytext());}
{iden}               {return new Symbol(sym.iden,yycolumn,yyline,yytext());}
{and}                {return new Symbol(sym.and,yycolumn,yyline,yytext());}
{or}                 {return new Symbol(sym.or,yycolumn,yyline,yytext());}
{correo}             {return new Symbol(sym.corr,yycolumn,yyline,yytext());}


/* BLANCOS */
[ \t\r\f\n\b]+     {/* Se ignoran */}


/* Cualquier Otro   ERROR LEXICO*/
.   {
erroresList error =new erroresList("ERROR LEXICO: ","LEXEMA:  "+yytext(),"FILA:  "+(yyline+1),"COLUMNA:  "+(yycolumn+1),"NO PERTENECE AL LENGUAJE");
ventanaPrincipal.errorLex.add(error);


       
System.out.println("error :  "+yytext());
}
