pushd C:
cd C:/Users/Sefa/Desktop/BachelorArbeit/
pdflatex Hauptdatei.tex
bibtex Hauptdatei

makeindex Hauptdatei.nlo -s latex_einstellungen/abkuezungen/nomencl.ist -o Hauptdatei.nls

pdflatex Hauptdatei.tex

pdflatex Hauptdatei.tex

del *.aux *.dvi *.log *.lot *.lol *.lof *.nls *.ilg *.nlo *.idx *.out *.toc *.ist *.glo *.blg
