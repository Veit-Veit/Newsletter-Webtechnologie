<script setup>
import { ref } from 'vue'

// Liste von Beispiel-Entitäten (News-Einträge)
const newsItems = ref([
  {
    id: 1,
    title: 'Willkommen zum Newsletter',
    author: 'Webtech Team',
    content: 'Der erste Newsletter ist online. Hier informieren wir über Neuigkeiten im Projekt.'
  },
  {
    id: 2,
    title: 'Spring Boot Backend eingerichtet',
    author: 'Veit',
    content: 'Das Backend stellt unter /news die ersten Daten über die REST-Schnittstelle bereit.'
  },
  {
    id: 3,
    title: 'Vue.js Frontend gestartet',
    author: 'Luis',
    content: 'Das Frontend nutzt Komponenten und die v-for Direktive zur Ausgabe von Listen.'
  }
])
</script>

<template>
  <div class="news-list">
    <h2>Aktuelle Beiträge</h2>
    <ul>
      <!-- Liste von Beispiel-Entitäten mit v-for rendern -->
      <li v-for="item in newsItems" :key="item.id" class="news-item">
        <h3>{{ item.title }}</h3>
        <p class="author">Autor: {{ item.author }}</p>
        <p class="content">{{ item.content }}</p>
      </li>
    </ul>
  </div>
</template>

<style scoped>
.news-list {
  max-width: 600px;
  margin: 0 auto;
}

ul {
  list-style: none;
  padding: 0;
  margin: 0;
}

.news-item {
  background: #ffffff;
  border: 1px solid #e0e0e0;
  border-radius: 8px;
  padding: 16px;
  margin-bottom: 16px;
}

.news-item h3 {
  margin: 0 0 8px 0;
  color: #222;
}

.author {
  font-size: 0.9em;
  color: #666;
  margin: 0 0 8px 0;
}

.content {
  margin: 0;
  color: #444;
  line-height: 1.5;
}
</style>
