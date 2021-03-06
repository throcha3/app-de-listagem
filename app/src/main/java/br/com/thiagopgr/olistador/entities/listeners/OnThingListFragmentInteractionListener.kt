package br.com.thiagopgr.olistador.entities.listeners

interface OnThingListFragmentInteractionListener {
    /**
     * Click para edição
     */
    fun onListClick(thingId: Int)

    /**
     * Remoção
     */
    fun onDeleteClick(thingId: Int)
}