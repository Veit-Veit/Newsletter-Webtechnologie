<script setup>
import NewsList from './components/NewsList.vue'
</script>

<template>
  <div class="app">
    <header>
      <h1>Newsletter-Webtechnologie</h1>
    </header>
    <main>
      <!-- Eigene Komponente, die eine Liste von Beispiel-Entitäten mit v-for rendert -->
      <NewsList />
    </main>
  </div>
</template>

<style scoped>
.app {
  max-width: 800px;
  margin: 0 auto;
  padding: 24px;
}

header {
  text-align: center;
  margin-bottom: 32px;
}

h1 {
  color: #222;
  margin: 0;
}
</style>
