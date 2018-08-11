
package Anallizadores;
import java_cup.runtime.Symbol;
import ejemplo1.*;
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

letra			=			[a-zA-ZÑñ_-]
digito			=			[0-9]



valor_numerico	=			[0-9]+ 
porcentaje		=			{digito}{digito}?"%"
id				=			{letra}+({letra}|{digito})*
cadena			=			[\"] [^\"\n]* [\"\n]
cierra			=			">"
bar                     =                       \/

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
"encabezado"            {return new Symbol(sym.encabezado,yycolumn,yyline,yytext());} 
"escuela"               {return new Symbol(sym.escuela,yycolumn,yyline,yytext());} 
"curso"      		    {return new Symbol(sym.curso,yycolumn,yyline,yytext());}
"docente"       		{return new Symbol(sym.docente,yycolumn,yyline,yytext());}
"seccion"          		{return new Symbol(sym.seccion,yycolumn,yyline,yytext());} 
"semestre"              {return new Symbol(sym.semestre,yycolumn,yyline,yytext());} 
"año"      		  		{return new Symbol(sym.año,yycolumn,yyline,yytext());}
"cuerpo"       			{return new Symbol(sym.cuerpo,yycolumn,yyline,yytext());}
"estudiante"          	{return new Symbol(sym.estudiante,yycolumn,yyline,yytext());} 
"ponderacion"           {return new Symbol(sym.ponderacion,yycolumn,yyline,yytext());} 
"valor"             	{return new Symbol(sym.valor,yycolumn,yyline,yytext());} 
"reportes"      		{return new Symbol(sym.reportes,yycolumn,yyline,yytext());}
"ra"       				{return new Symbol(sym.ra,yycolumn,yyline,yytext());}
"rr"       				{return new Symbol(sym.rr,yycolumn,yyline,yytext());}
"rp"       				{return new Symbol(sym.rp,yycolumn,yyline,yytext());}
"re"       				{return new Symbol(sym.re,yycolumn,yyline,yytext());}
"true"       			{return new Symbol(sym.verdadero,yycolumn,yyline,yytext());}
"false"       			{return new Symbol(sym.falso,yycolumn,yyline,yytext());}
"color-t"       		{return new Symbol(sym.ct,yycolumn,yyline,yytext());}
"color-v"       		{return new Symbol(sym.cv,yycolumn,yyline,yytext());}
"color-c"       		{return new Symbol(sym.cc,yycolumn,yyline,yytext());}
"color-na"       		{return new Symbol(sym.na,yycolumn,yyline,yytext());}
"color-nr"       		{return new Symbol(sym.nr,yycolumn,yyline,yytext());}
"logo"		       		{return new Symbol(sym.logo,yycolumn,yyline,yytext());}
"bordes"       			{return new Symbol(sym.bordes,yycolumn,yyline,yytext());}
"estilo"       			{return new Symbol(sym.estilo,yycolumn,yyline,yytext());}
    
//SIMBOLOS

"<"              		{return new Symbol(sym.abre,yycolumn,yyline,yytext());}   
"="              		{return new Symbol(sym.igual,yycolumn,yyline,yytext());} 
":"            			{return new Symbol(sym.dosPuntos,yycolumn,yyline,yytext());}  
","             		{return new Symbol(sym.coma,yycolumn,yyline,yytext());}  


{valor_numerico} 		{return new Symbol(sym.valorNumerico,yycolumn,yyline,yytext());}
{porcentaje}     		{return new Symbol(sym.porcentaje,yycolumn,yyline,yytext());}
{cadena}         		{return new Symbol(sym.cadena,yycolumn,yyline,yytext());}
{id}          			{return new Symbol(sym.id,yycolumn,yyline,yytext());}
{cierra}         		{return new Symbol(sym.cierra,yycolumn,yyline,yytext());}
{bar}                   	{return new Symbol(sym.bar,yycolumn,yyline,yytext());}

/* BLANCOS */
[ \t\r\f\n\b]+     {/* Se ignoran */}


/* Cualquier Otro   ERROR LEXICO*/
.   {
erroresList error =new erroresList("ERROR LEXICO: ","LEXEMA:  "+yytext(),"FILA:  "+(yyline+1),"COLUMNA:  "+(yycolumn+1),"NO PERTENECE AL LENGUAJE");
        Open.lista.add(error);


       
System.out.println("error :  "+yytext());
}
