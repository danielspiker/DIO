function mudaModo() {
  mudaClasses()
  mudaTextos()
}

function mudaClasses() {
  botao.classList.toggle(darkModeClass)
  titulo.classList.toggle(darkModeClass)
  body.classList.toggle(darkModeClass)
  footer.classList.toggle(darkModeClass)
}

function mudaTextos() {
  const lightMode = 'Light Mode'
  const darkMode = 'Dark Mode'

  if (body.classList.contains(darkModeClass)) {
    botao.innerHTML = lightMode
    titulo.innerHTML = `${darkMode} ON`
  } else {
    botao.innerHTML = darkMode
    titulo.innerHTML = `${lightMode} ON`
  }
}

const darkModeClass = 'dark-mode'
const botao = document.getElementById('mode-selector')
const titulo = document.getElementById('page-title')
const body = document.getElementsByTagName('body')[0]
const footer = document.getElementsByTagName('footer')[0]

botao.addEventListener('click', mudaModo)
