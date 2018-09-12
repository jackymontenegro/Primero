
package Analizador;
import java_cup.runtime.Symbol;
import compi1.corto1.ventanaPrincipal;
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
correo                  =                       ({letra}|{digito})+\@"compiladores1"\."com"
iden			=			{letra}+({letra}|{digito})*
cadena			=			[\"] [^\"\n]* [\"\n]


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
{correo}             {return new Symbol(sym.corr,yycolumn,yyline,yytext());}


/* BLANCOS */
[ \t\r\f\n\b]+     {/* Se ignoran */}


/* Cualquier Otro   ERROR LEXICO*/
.   {
erroresList error =new erroresList("LEXICO"," "+yytext()," "+(yyline+1)," "+(yycolumn+1),"NO PERTENECE AL LENGUAJE");
ventanaPrincipal.errorLex.add(error);


       
System.out.println("error :  "+yytext());
}
