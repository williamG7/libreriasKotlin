package models

class Agenda():AgendaAbstracta(){

    override fun add(nom: String, telefon: String, edat: Int) {}

    override fun add(c: Contacte?) {}

    override fun remove(c: Contacte) {}

    override fun search(nom: String): ArrayList<Contacte> {
        return getContactes()
    }

    override fun searchExact(nom: String): ArrayList<Contacte> {

        return getContactes()
    }

    override fun searchLike(start: String, end: String, vararg contain: String): ArrayList<Contacte> {
        return getContactes()
    }

    override fun sorted(): ArrayList<Contacte> {
        val lista = getContactes().sorted()
        return getContactes()
    }


}