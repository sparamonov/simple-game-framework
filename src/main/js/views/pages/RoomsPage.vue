<script>
import GameRoom from "../components/Room";

export default {
    components: {
        GameRoom
    },
    computed: {
        rooms () {
            return this.$store.state.rooms
        }
    },
    created() {
        this.$store.dispatch('loadRooms')
    }
}
</script>

<template>
    <div>
        <h1>Rooms page</h1>
        <div v-for="room in rooms" v-bind:key="room.id">
            <game-room v-bind:room="room"/>
        </div>
    </div>
</template>