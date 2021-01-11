<script>
export default {
    created() {
        this.$store.dispatch('auth')
    }
}
</script>

<template>
    <div id="app">
      <router-view/>
    </div>
</template>
