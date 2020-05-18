# Kitch

Aplikacija za pomoć pri naručivanju kućne dostave. Omogućuje jednostavnu i pametnu pretragu i preporuku mogućih jela kupcu i pregledan sistem za vođenje biznisa dostavljaču.

Aplikacija je namenjena za tri različita korisnika: za poručioca, za menadžera restorana i za radnike restorana.  

Svaki od korisnika se mora prvobitno logovati na svoj nalog.  
Poručilac i menadžer sami kreiraju svoje naloge, dok menadžer kreira naloge svojim radnicima.  


## Poručilac
Pregled istorije porudžbina

Pretraga:
* po nazivu (restorana ili jela)
* po tipu jela (roštilj, pica, kineska hrana, dezert...)
* po tagovima (posno, vegansko, ljuto...)
* po sastojcima koje sardži (ili ne sadrži)
	
Sortiranje rezultata:
* pametno (uračunava cenu sa popustima, ocenu jela, popularnost jela)
* po najpovoljnijoj ceni
* po oceni

Za svaku pretragu ponuditi i jela i restorane koji zadovoljavaju kriterijume pretrage

Po odabiru restorana, prikazuje se jelovnik sa kojeg korisnik može da bira jelo koje želi da poruči i količinu. Jelo se dodaje u korpu i korisnik može da odabere da druga jela, da poruči jela iz korpe ili da napusti stranicu restorana i time isprazni korpu

Nakon što je korisnik izvršio porudžbinu, kreira se zahtev za porudžbinom koji obrađuje radnik restorana. Radnik može da prihvati ili odbije zahtev. Ukoliko se zahtev odobri korisniku se vraća očekivano vreme dostave, a ukoliko se odbije zahtev šalje se poruka sa obrazloženjem

Nakon što se izvrši isporuka korisnik može da oceni jelo


## Menadžer
Pregled i izmena osnovnih podataka o restoranu

Pregled svih porudžbina i statistika vezanih za restoran (popularnost i ocene proizvoda, najprometniji sati, prihodi u zadatom periodu...)

Uređivanje menija (dodavanje, izmena i uklanjanje stavki)

Dodavanje i uklanjanje radnika

Dodeljivanje popusta; tri vrste:
* akcijski (u određenom vremenskom periodu, na određene stavke)
* količinski (ukoliko se naruči više od zadate količine za određenu stavku)
* odanost (poručioc dobija status bronzanog, srebrnog i zlatnog gosta u zavisnosti od ukupnog računa napravljenog u tom restoranu)
	

## Radnik
Pregled nerešenih porudžbina

Nakon što stigne nova porudžbina radnik treba da obradi zahtev, da ga odobri i poručiocu vrati očekivano vreme isporuke, ili odbije uz obrazloženje zašto je zahtev odbijen

Nakon što se izvrši isporuka treba promeniti status porudžbine u 'isporučeno' i time ukloniti iz liste nerešenih porudžbina

