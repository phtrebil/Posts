package br.com.alura.ceep.ui.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.ceep.BR
import br.com.alura.ceep.R
import br.com.alura.ceep.databinding.ItemNotaBinding
import br.com.alura.ceep.model.Nota
import br.com.alura.ceep.ui.extensions.carregaImagem
import kotlinx.android.synthetic.main.item_nota.view.*
import kotlinx.coroutines.channels.BroadcastChannel

class ListaNotasAdapter(
    private val context: Context,
    var onItemClickListener: (notaSelecionada: Nota) -> Unit = {}
) : ListAdapter<Nota, ListaNotasAdapter.ViewHolder>(DiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val viewDataBinding =
           ItemNotaBinding.inflate(inflater, parent, false)
        return ViewHolder(viewDataBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        getItem(position)?.let { nota ->
            holder.vincula(nota)
        }
    }

    inner class ViewHolder(private val viewDataBinding: ItemNotaBinding) :
        RecyclerView.ViewHolder(viewDataBinding.root), View.OnClickListener {

        override fun onClick(view: View?) {
            if (::nota.isInitialized) {
                onItemClickListener(nota)
            }
        }

        private lateinit var nota: Nota

        init {
           viewDataBinding.clicaNaNota = this
        }

        fun vincula(nota: Nota) {
            this.nota = nota
            viewDataBinding.nota = nota


        }

    }

    object DiffCallback : DiffUtil.ItemCallback<Nota>() {
        override fun areItemsTheSame(
            oldItem: Nota,
            newItem: Nota
        ) = oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: Nota, newItem: Nota) = oldItem == newItem

    }
    @BindingAdapter("carregaImagem")
    fun carregaImagemPorUrl(view: ImageView, url: String){
        view.carregaImagem(url)
    }
}